package application.controller;

import application.domain.Owner;
import application.jwt.JwtTokenProvider;
import application.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class OwnerController {

    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final OwnerService ownerService;

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> user) {
        Owner owner = (Owner) ownerService.loadUserByUsername(user.get("email"));
        if (!passwordEncoder.matches(user.get("password"), owner.getPassword())) {
            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
        }
        return jwtTokenProvider.createToken(owner.getUsername(), owner.getRoles());
    }
}

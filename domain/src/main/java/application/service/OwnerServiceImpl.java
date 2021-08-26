package application.service;

import application.domain.Category;
import application.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService{

    private final OwnerRepository ownerRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return ownerRepository.findByUsername(s).orElseThrow(() -> new IllegalArgumentException("가입되지 않은 email"));
    }


}

package pl.mmalkiew.app.crypto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by mmalkiew on 2015-03-25.
 */
public class PasswordCrypto {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private static PasswordCrypto instance;

    public static PasswordCrypto getInstance() {
        if(instance == null) {
            instance = new PasswordCrypto();
        }

        return instance;
    }

    public String encrypt(String str) {
        return passwordEncoder.encode(str);
    }
}

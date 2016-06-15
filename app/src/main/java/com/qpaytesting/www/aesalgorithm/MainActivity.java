package com.qpaytesting.www.aesalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView encrypt= (TextView) findViewById(R.id.encrypt);
        TextView decrypt= (TextView) findViewById(R.id.decrypt);

        String password = "password";
        String message = "Qpay  nepal ";
        try {
            String encryptedMsg = AESCrypt.encrypt(password, message);
            encrypt.setText(encryptedMsg);
            String decryptEnc= AESCrypt.decrypt(password,encryptedMsg);
            decrypt.setText(decryptEnc);


        }catch (GeneralSecurityException e){
            e.printStackTrace();
        }


    }


}

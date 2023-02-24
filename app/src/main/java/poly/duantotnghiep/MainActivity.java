package poly.duantotnghiep;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import poly.duantotnghiep.auth.SignInActivity;
import poly.duantotnghiep.auth.verify_account.VerifyAccountActivity;
import poly.duantotnghiep.on_board.OnboardActivity;
import poly.duantotnghiep.on_board.welcome.WelComeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, WelComeActivity.class));
    }
}
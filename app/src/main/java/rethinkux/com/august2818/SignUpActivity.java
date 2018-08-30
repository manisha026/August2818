package rethinkux.com.august2818;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button mBtnRegister;
    TextView mTextViewLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mBtnRegister=findViewById(R.id.btn_register);
        mTextViewLogin=findViewById(R.id.tv_login);

        mTextViewLogin.setOnClickListener(this);
        mBtnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.tv_login:
                Intent intent=new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_register:
                intent=new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

    }
}

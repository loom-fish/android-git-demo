package com.example.gitpart03;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;
    private TextView tvInfo;

    private static final String STUDENT_ID = "202422430908";
    private static final String Name = "郭雨鑫";




    private static final String PASSWORD = "password123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 初始化视图
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        tvInfo = findViewById(R.id.tv_info);

        // 设置按钮点击事件
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputId = etUsername.getText().toString();
                String inputPwd = etPassword.getText().toString();

                // 验证输入
                if (inputId.equals(STUDENT_ID) && inputPwd.equals(Name)) {
                    Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    // 显示学号和密码（仅作演示，实际项目勿这样处理敏感信息）
                    tvInfo.setText("学号: " + STUDENT_ID + "\n姓名: " + Name);
                } else {
                    Toast.makeText(LoginActivity.this, "学号或密码错误", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
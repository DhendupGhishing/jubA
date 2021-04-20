package gcit.edu.jobhut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class JobseekerActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private TextView banner,registeruser;
    private EditText cid,name,email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jobseeker);
        mAuth = FirebaseAuth.getInstance();
         banner=(TextView) findViewById(R.id.)
    }
}
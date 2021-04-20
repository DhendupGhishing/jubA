package gcit.edu.jobhut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void jobseeker(View view) {
        Intent job= new Intent(this,JobseekerActivity.class);
        startActivity(job);
    }

    public void employer(View view) {
        Intent employe= new Intent(this,EmployeeActivity.class);
        startActivity(employe);
    }



}
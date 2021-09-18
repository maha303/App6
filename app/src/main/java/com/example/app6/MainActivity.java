package com.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
 class DelegationDemonstration {
    public static void main(String[] args){
        Employee.KotlinDeveloper kd = new Employee.KotlinDeveloper();

        Employee james = new Employee(kd);
        james.writeCode();
    }
}
interface WhoCanCode {
    void writeCode();
}
class Employee implements WhoCanCode{
    WhoCanCode dev;
    public Employee (WhoCanCode dev){
        this.dev=dev;
    }
    public void writeCode() {
        dev.writeCode();
    }
    static class KotlinDeveloper implements WhoCanCode {
        @Override
        public void writeCode() {
            System.out.println("I'm writing Kotlin Code");
        }
    }
}
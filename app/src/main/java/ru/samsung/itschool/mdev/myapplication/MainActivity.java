package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // инициализация активности
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRRR","onCreate()");
    }

    // вызывается, когда сама активность стала видимой
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRRR","onStart()");
    }

    // обновление UI (пользоват. интерфейса)
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRRR","onResume()");
    }

    // освобождение ресурсов, соединения с Сетью и БД
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRRR","onDestroy()");
    }

    // приостановка UI (активность не на переднем плане)
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRRR","onStop()");
    }

    // вызыывается перед выходом из активного состояния
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRRR","onPause()");
    }


    // перезапуск активности
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRRR","onRestart()");
    }
}
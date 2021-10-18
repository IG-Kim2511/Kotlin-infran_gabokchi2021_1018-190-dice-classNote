package com.example.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

//    🍀DataBinding 준비

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//    🍀DataBinding 준비
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        val
        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

//
        binding.diceStartBtn.setOnClickListener {

            Toast.makeText(this,"game start",Toast.LENGTH_LONG).show()
            
            
//            Random.nextInt(1,6) : 1~6 숫자를 가져오는 함수
//            Random.nextInt(1,6)
//            Random.nextInt(1,6)

//            log 확인하기, log로 뽑기위해 toString 필요.number-> string 바꿔줌
            Log.d("MainActivity", Random.nextInt(1,6).toString())
            Log.d("MainActivity", Random.nextInt(1,6).toString())


//          🍀setImageResource
//            1. 버튼 클릭하면,
//            2. diceImage1 id 붙은 ImageView의
//            3.src를... dice_2로 바꿈

//            diceImage1.setImageResource(R.drawable.dice_2)
//            diceImage2.setImageResource(R.drawable.dice_2)


//       🍀버튼 클릭하면, 1~6 랜덤넘버가, val변수에 들어감
            val number1 =  Random.nextInt(1,6)
            val number2 =  Random.nextInt(1,6)


//🍄
//diceImage1의...
//random 넘버가 1이면 , src...dice_1
//random 넘버가 2이면 , src...dice_2

//            diceImage1
            if (number1 == 1){
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if (number1 == 2){
                diceImage1.setImageResource(R.drawable.dice_2)

            }else if (number1 == 3){
                diceImage1.setImageResource(R.drawable.dice_3)

            }else if (number1 == 4){
                diceImage1.setImageResource(R.drawable.dice_4)

            }else if (number1 == 5){
                diceImage1.setImageResource(R.drawable.dice_5)

            }else{
                diceImage1.setImageResource(R.drawable.dice_6)
            }


//          diceImage2

            if (number2 == 1){
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if (number2 == 2){
                diceImage2.setImageResource(R.drawable.dice_2)
            }else if (number2 == 3){
                diceImage2.setImageResource(R.drawable.dice_3)
            }else if (number2 == 4){
                diceImage2.setImageResource(R.drawable.dice_4)
            }else if (number2 == 5){
                diceImage2.setImageResource(R.drawable.dice_5)
            }else{
                diceImage2.setImageResource(R.drawable.dice_6)
            }




        }
    }

}
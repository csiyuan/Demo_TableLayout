package sg.edu.rpc346.id19016011.demotablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnOnclick(view: View){
        var msg = ""
        val btnSelected = view as Button
        when (btnSelected.id){
            button1.id -> msg = "button 1 is clicked"
            button2.id -> msg = "button 2 is clicked"
            button3.id -> msg = "button 3 is clicked"
            button4.id -> msg = "button 4 is clicked"
            button5.id -> msg = "button 5 is clicked"
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
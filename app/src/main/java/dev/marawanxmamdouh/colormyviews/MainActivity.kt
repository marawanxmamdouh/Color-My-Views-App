package dev.marawanxmamdouh.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import dev.marawanxmamdouh.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        val views: List<View> = listOf(
            binding.tvBoxOne,
            binding.tvBoxTwo,
            binding.tvBoxThree,
            binding.tvBoxFour,
            binding.tvBoxFive,
            binding.root,
            binding.btnRed,
            binding.btnGreen,
            binding.btnYellow
        )
        for (view in views) {
            view.setOnClickListener {
                setBackgroundColor(it)
            }
        }
    }

    private fun setBackgroundColor(view: View) {
        when (view.id) {
            R.id.tvBoxOne -> view.setBackgroundColor(Color.CYAN)
            R.id.tvBoxTwo -> view.setBackgroundColor(Color.LTGRAY)
            R.id.tvBoxThree -> view.setBackgroundColor(Color.BLUE)
            R.id.tvBoxFour -> view.setBackgroundColor(Color.argb(255, 128, 32, 64))
            R.id.tvBoxFive -> view.setBackgroundColor(Color.MAGENTA)
            R.id.btnRed -> binding.tvBoxThree.setBackgroundColor(Color.RED)
            R.id.btnGreen -> binding.tvBoxFour.setBackgroundColor(Color.GREEN)
            R.id.btnYellow -> binding.tvBoxFive.setBackgroundColor(Color.YELLOW)
            else -> Color.WHITE
        }
    }
}
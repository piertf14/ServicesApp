package pe.edu.upc.tarea2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_service_detail.*

class ServiceDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_detail)
        val service = intent.extras.getParcelable<Service>(Service)
        text_service_detail_text.text=service.name
        image_service_detail.setImageDrawable(ContextCompat.getDrawable(this, service.image))

    }

    companion object {
        val Service="service"
    }
}

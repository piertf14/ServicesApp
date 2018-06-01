package pe.edu.upc.tarea2


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.fragment_services.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ServicesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_services, container, false)
    }

    companion object {
        fun new_instance():Fragment{
            val fragment = ServicesFragment()
            return fragment
        }
    }


    fun to_list()= listOf<Service>(
            Service(R.drawable.crehana_pulsosocial, "service 1"),
            Service(R.drawable.upc_logo_transparente, name= "service 2")
    )

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recycler_service_view.layoutManager=LinearLayoutManager(activity)
        recycler_service_view.adapter=ServiceAdapter(to_list())
    }


}

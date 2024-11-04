package com.faiz.tugasrecycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.faiz.tugasrecycler.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.rvMovie

        val movieList = listOf(
            Movie(R.drawable.venom_poster, "Venom : The Last Dance", "1h 30m","R13+", "Journalist Eddie Brock is trying to take down Carlton Drake, the notorious and brilliant founder of the Life Foundation. While investigating one of Drake\\'s experiments, Eddie\\'s body merges with the alien Venom -- leaving him with superhuman strength and power. Twisted, dark and fueled by rage, Venom tries to control the new and dangerous abilities that Eddie finds so intoxicating."),
            Movie(R.drawable.dosa_musyrik_poster, "DOSA MUSYRIK", "1h 32m", "D17+", "Kisah utama film ini adalah tentang Nugie, yang diperankan oleh Marthino Lio. Nugie memiliki seorang ibu dengan kondisi sakit parah. Pengobatan ibunya tidak tuntas karena sulitnya ekonomi.\n" + "\n" + "Nugie terpaksa berutang sehingga terlilit oleh bunga piutangnya. Ia menjadi gelap mata dan putus asa. Nugie lalu memutuskan meminta bantuan dukun, Mbah Narto.\n" + "\n" + "Mbah Narto kemudian memberi sebuah keris kepada Nugie. Ketika sudah membawa keris itu ke rumah, keluarga Nugie mulai mendapat teror gaib.\n" + "\n" + "Keris itu memiliki penunggu bernama Ni Larapati. Sosok gaib itu mulai meminta nyawa keluarga Nugie satu per satu."),
            Movie(R.drawable.inside_out_poster, "Inside Out 2", "1h 45m", "7+", "Pada sekuel film ini menceritakan tentang Riley yang beranjak remaja dan memasuki masa pubertas mengalami ketidakstabilan emosi yang membuat munculnya emosi-emosi baru yang mengambil kendali isi pikirannya yang sebelumnya hanya dipegang oleh emosi Joy, Sadness, Anger, Fear, dan Disgust.\n" + "\n" + "Emosi-emosi tersebut merupakan Anxiety, Envy, Embarrassment, dan Ennui.\n" + "\n" + "Para emosi baru ini muncul karena perubahan rencana mendadak dimana kedua sahabatnya mengaku bahwa mereka akan pindah sekolah dan meninggalkan Riley di sekolah barunya sendirian. Hal ini membuat Riley sedih dan gelisah akan masa depan dimana ia tidak bersama dengan sahabat-sahabatnya."),
            Movie(R.drawable.transformer_poster, "Transformer One", "1h 45m", "R13+", "Berlatar di planet Cybertron, film Transformers One akan menyajikan kisah persahabatan antara Optimus Prime dan Megatron. Namun, konflik yang dihadapi mengubah hubungan keduanya dari saudara seperjuangan menjadi musuh bebuyutan.Selain itu, Transformers One juga akan mengeksplor kisah awal perseteruan kelompok Autobots dan Decepticons. Yang hingga kini kedua kelompok yang masing-masing dipimpin oleh Prime dan Megatron, dikenal sebagai pertempuran kelompok mecha yang tak berujung.\n"),
        )

        recyclerView.adapter = MovieAdapter(requireContext(), movieList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
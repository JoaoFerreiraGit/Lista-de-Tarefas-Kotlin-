package com.codartch.lista_de_tarefas.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.codartch.lista_de_tarefas.databinding.FragmentListTasksBinding

class ListTasksFragment : Fragment() {

    private var _binding: FragmentListTasksBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentListTasksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerViewTasks.layoutManager = LinearLayoutManager(context)
        // Aqui você configurará o adapter do RecyclerView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

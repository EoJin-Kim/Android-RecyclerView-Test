package com.ej.defaultcamera_gallary_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ej.defaultcamera_gallary_test.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    lateinit var binding : FragmentBlankBinding

    private val coinTypeList = arrayListOf<String>(
        "pci","unionpay","btc","eth","btc","eth","btc","eth"
    )
    val transactionList1 = arrayListOf<TransactionHistory>(
        TransactionHistory("Payment","20230505 13:01","-1233.13","aaaaa"),
        TransactionHistory("Payment","20230505 13:01","-1233.13","bbbbb"),
        TransactionHistory("Payment","20230505 13:01","-1233.13","ccccc"),
        TransactionHistory("Payment","20230505 13:01","-1233.13","ddddd"),
        TransactionHistory("Payment","20230505 13:01","-1233.13","eeeee"),
    )
    val transactionList2 = arrayListOf<TransactionHistory>(
        TransactionHistory("Send","20230506 13:01","-1233.13","aaaaa"),
        TransactionHistory("Send","20230506 13:01","-1233.13","bbbbb"),
        TransactionHistory("Send","20230506 13:01","-1233.13","ccccc"),
        TransactionHistory("Send","20230506 13:01","-1233.13","ddddd"),
        TransactionHistory("Send","20230506 13:01","-1233.13","eeeee"),
    )
    val transactionDateList = arrayListOf<TransactionDateHistory>(
        TransactionDateHistory("2023.01.02 TUE", transactionList2),
        TransactionDateHistory("2023.01.01 MON", transactionList1),

        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  DataBindingUtil.inflate(inflater,R.layout.fragment_blank,container,false)
        binding.lifecycleOwner = this.viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val horizontalAdapter = ListAdapterHorizontal(coinTypeList)
        binding.horizontalRecycler.adapter = horizontalAdapter

        val verticalAdapter = ListAdapterVertical(transactionDateList)
        binding.verticalRecycler.adapter = verticalAdapter
        verticalAdapter.notifyDataSetChanged()

    }

    companion object {

        @JvmStatic
        fun newInstance() =
            BlankFragment()
    }
}
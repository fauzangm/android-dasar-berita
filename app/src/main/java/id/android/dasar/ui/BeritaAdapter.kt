package id.android.dasar.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.android.dasar.data.ModelBerita
import id.android.dasar.databinding.ItemBodyBeritaBinding
import javax.inject.Inject


class BeritaAdapter @Inject constructor() :
    ListAdapter<ModelBerita, BeritaAdapter.ViewHolder>(ListDiffUtill()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemBodyBeritaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        holder.binding.tvBerita.text = data.tittle
//        holder.binding.cvContainer.setOnClickListener {
//            EventBus.getDefault().post(ItemDataBeritaEvent(data))
//        }
    }

    class ViewHolder(itemBinding: ItemBodyBeritaBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        var binding: ItemBodyBeritaBinding = itemBinding
    }

    class ListDiffUtill : DiffUtil.ItemCallback<ModelBerita>() {
        override fun areItemsTheSame(oldItem: ModelBerita, newItem: ModelBerita): Boolean {
            return newItem.tittle == oldItem.tittle
        }

        override fun areContentsTheSame(oldItem: ModelBerita, newItem: ModelBerita): Boolean {
            return areItemsTheSame(oldItem, newItem)
        }
    }
}
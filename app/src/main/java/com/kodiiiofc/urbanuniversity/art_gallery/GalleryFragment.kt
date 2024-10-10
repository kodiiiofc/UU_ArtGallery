package com.kodiiiofc.urbanuniversity.art_gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val titleTV: TextView = view.findViewById(R.id.tv_title)
        val authorTV: TextView = view.findViewById(R.id.tv_author)
        val pictureIV: ImageView = view.findViewById(R.id.iv_picture)

        val picture = arguments?.getSerializable("picture") as Picture
        titleTV.text = picture.title
        authorTV.text = picture.authorName
        pictureIV.setImageResource(picture.imageResources)
    }

}
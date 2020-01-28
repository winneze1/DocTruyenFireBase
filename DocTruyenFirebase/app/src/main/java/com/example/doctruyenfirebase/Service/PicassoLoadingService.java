package com.example.doctruyenfirebase.Service;

import android.widget.ImageView;

import com.example.doctruyenfirebase.R;
import com.squareup.picasso.Picasso;

import ss.com.bannerslider.ImageLoadingService;

public class PicassoLoadingService implements ImageLoadingService {

    @Override
    public void loadImage(String url, ImageView imageView) {
        Picasso.get().load(url).into(imageView);
    }

    @Override
    public void loadImage(int resource, ImageView imageView) {
        Picasso.get().load(resource).into(imageView);
    }

    @Override
    public void loadImage(String url, int placeHolder, int errorDrawable, ImageView imageView) {
        Picasso.get().load(url).placeholder(R.drawable.placeholder).error(R.drawable.error).into(imageView);
    }
}

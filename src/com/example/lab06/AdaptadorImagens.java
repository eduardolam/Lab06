package com.example.lab06;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/* 
 * 
 * @author Eduardo Luiz Arthur Marques - 12296045
 * 
 *
 */

public class AdaptadorImagens extends BaseAdapter {

	private int itensMinhaGaleria;
    Context contexto;
    
	private Integer[] minhasIdsImagem = {
		R.drawable.moto1,
		R.drawable.moto2,
		R.drawable.moto3
	};
	
	public AdaptadorImagens(Context contextoParam){
		contexto = contextoParam;
		TypedArray atributos = contexto.obtainStyledAttributes(R.styleable.minhaGaleria);
		itensMinhaGaleria = atributos.getResourceId(R.styleable.minhaGaleria_android_galleryItemBackground, 0);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return minhasIdsImagem.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		ImageView imageView = new ImageView(contexto);
		
		imageView.setImageResource(minhasIdsImagem[position]);
		imageView.setLayoutParams(new Gallery.LayoutParams(150, 100));
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setBackgroundResource(itensMinhaGaleria);
		
		return imageView;
	}

}

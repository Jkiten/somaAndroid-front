package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder>{
    //뷰홀더 생성자로 전달되는 뷰 객체 참조

        ArrayList<Person> items = new ArrayList<Person>();

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            View itemView = inflater.inflate(R.layout.layout1,viewGroup,false);

            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
            Person item = items.get(position);
            viewHolder.setItem(item);
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        public void addItem(Person item){
            items.add(item);
        }
        public void setItems(ArrayList<Person> items){
            this.items = items;
        }
        public  Person getItem(int postion){
            return items.get(postion);
        }

        public void setItem(int position, Person item){
            items.set(position,item);
        }

        static class ViewHolder extends RecyclerView.ViewHolder{
            TextView textView;
            TextView textView2;

            //뷰객체에 들어있는 텍스트뷰 참조
            public ViewHolder(View itemView){
                super(itemView);

                textView=itemView.findViewById(R.id.textView);
                textView2=itemView.findViewById(R.id.textView2);
            }

            public  void setItem(Person item){
                textView.setText(item.getName());
                textView2.setText(item.getMobile());
            }

        }
}

package unipe.aula.com.josiasandroidestagio_01;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<Contato> list;
    private LayoutInflater layoutInflater;
    private ItemClick itemClick;

    public void setItemClick(final ItemClick itemClick) {
        this.itemClick = itemClick;
    }

    public MyAdapter(List<Contato> list, Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.itens, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Contato contato = list.get(position);
        holder.nome.setText(contato.getNome());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView nome;
        private ImageView telefone;
        private View view;

        public MyViewHolder(View itemView) {
            super(itemView);

            nome = (TextView) itemView.findViewById(R.id.nome);
            telefone = (ImageView) itemView.findViewById(R.id.telefone);
            telefone.setOnClickListener(this);
            view = itemView.findViewById(R.id.linear_layout);

        }

        @Override
        public void onClick(View view) {
            if(view.getId() == R.id.telefone){
                itemClick.onIconClick(getAdapterPosition());
            }
        }
    }

}

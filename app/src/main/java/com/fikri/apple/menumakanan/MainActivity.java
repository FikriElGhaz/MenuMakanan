package com.fikri.apple.menumakanan;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    int[] foto= {R.drawable.sotoayam,
    R.drawable.ketoprak,
    R.drawable.baso,
    R.drawable.sate,
    R.drawable.sop,
    R.drawable.gado,
    R.drawable.mie,
    R.drawable.tempe,
    R.drawable.tahu,
    R.drawable.rendang,
    R.drawable.pempek,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list_makanan);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent soto = new Intent(MainActivity.this, detail.class);
                    soto.putExtra("posisi", position);
                    soto.putExtra("Link", "https://www.bango.co.id/resep/detail/1657/soto-ayam");
                    soto.putExtra("foto", foto [0]);
                    startActivity(soto);
                }else  if (position == 1){
                    Intent ketoprak = new Intent(MainActivity.this, detail.class);
                    ketoprak.putExtra("posisi", position);
                    ketoprak.putExtra("Link", "https://www.bango.co.id/resep/detail/950/-i-ketoprak--i-");
                    ketoprak.putExtra("foto", foto [1]);
                    startActivity(ketoprak);
                }else  if (position == 2){
                    Intent baso = new Intent(MainActivity.this, detail.class);
                    baso.putExtra("posisi", position);
                    baso.putExtra("Link", "https://www.bango.co.id/resep/detail/1765/-i-bakso--i--telur-puyuh-bumbu-empal-gepuk");
                    baso.putExtra("foto", foto [2]);
                    startActivity(baso);
                }else  if (position == 3){
                    Intent  sate= new Intent(MainActivity.this, detail.class);
                    sate.putExtra("posisi", position);
                    sate.putExtra("Link", "https://www.bango.co.id/resep/detail/1871/-i-sate--i--kambing-tegal-ala-h-sadjim");
                    sate.putExtra("foto", foto [3]);
                    startActivity(sate);
                }else  if (position == 4){
                    Intent  sop= new Intent(MainActivity.this, detail.class);
                    sop.putExtra("posisi", position);
                    sop.putExtra("Link", "https://www.bango.co.id/resep/detail/1820/-i-sop--i--buntut-surabaya");
                    sop.putExtra("foto", foto [4]);
                    startActivity(sop);
                }else  if (position == 5){
                    Intent  gado= new Intent(MainActivity.this, detail.class);
                    gado.putExtra("posisi", position);
                    gado.putExtra("Link", "https://www.bango.co.id/resep/detail/471/gado--i-gado---i-khas-kota-padang");
                    gado.putExtra("foto", foto [5]);
                    startActivity(gado);
                }else  if (position == 6){
                    Intent  mie = new Intent(MainActivity.this, detail.class);
                    mie.putExtra("posisi", position);
                    mie.putExtra("Link", "https://www.bango.co.id/resep/detail/1705/-i-mie-g--i-oreng-jawa");
                    mie.putExtra("foto", foto [6]);
                    startActivity(mie);
                }else  if (position == 7){
                    Intent tempe = new Intent(MainActivity.this, detail.class);
                    tempe.putExtra("posisi", position);
                    tempe.putExtra("Link", "https://www.bango.co.id/resep/detail/1749/bacem-tahu--i-tempe-g--i-urih-jogja");
                    tempe.putExtra("foto", foto [7]);
                    startActivity(tempe);
                }else  if (position == 8){
                    Intent tahu = new Intent(MainActivity.this, detail.class);
                    tahu.putExtra("posisi", position);
                    tahu.putExtra("Link", "https://www.bango.co.id/resep/detail/1849/-i-tahu--i--masak-kecap");
                    tahu.putExtra("foto", foto [8]);
                    startActivity(tahu);
                }else  if (position == 9){
                    Intent rendang = new Intent(MainActivity.this, detail.class);
                    rendang.putExtra("posisi", position);
                    rendang.putExtra("Link", "https://www.bango.co.id/resep/detail/327/-i-rendang--i--manis");
                    rendang.putExtra("foto", foto [9]);
                    startActivity(rendang);
                }else  if (position == 10){
                    Intent pempek = new Intent(MainActivity.this, detail.class);
                    pempek.putExtra("posisi", position);
                    pempek.putExtra("Link", "https://www.bango.co.id/resep/detail/858/-i-pempek--i--isi-telur");
                    pempek.putExtra("foto", foto [10]);
                    startActivity(pempek);
                }
            }
        });


    }
}

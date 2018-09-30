package test.application.ivote.Featured_Film_Page;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import test.application.ivote.MainActivity;
import test.application.ivote.R;
import test.application.ivote.Recycler_fims_main.Film_pojo;
import test.application.ivote.Recycler_fims_main.RecyclerFilmsAdapter;

public class FeaturedVideosActivity extends AppCompatActivity {
RecyclerView recycler_films_featured;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured_videos);
        recycler_films_featured=findViewById(R.id.recycler_films_featured);
        createDataRecyclerMain();
    }
    void createDataRecyclerMain() {
        List<Film_pojo> filmpojo = new ArrayList<>();
        Film_pojo hezarpa = new Film_pojo("هزارپا", "ماندانا,آزادی,کوروش,ملت", getResources().getDrawable(R.drawable.hezarpa), "حسن فتحی", "120");
        Film_pojo katiusha = new Film_pojo("کاتیوشا", "ماندانا,آزادی,کوروش,ملت", getResources().getDrawable(R.drawable.katiusha), "علی عطشانی", "90");
        Film_pojo tangeabooghoraib = new Film_pojo("تنگه ابوقریب", "ماندانا,آزادی,کوروش,ملت", getResources().getDrawable(R.drawable.tange), "بهرام توکلی", "90");
        Film_pojo latari = new Film_pojo("لاتاری", "ماندانا,آزادی,کوروش,ملت", getResources().getDrawable(R.drawable.titlee), "محمدحسین مهدویان", "90");
        Film_pojo dashakol = new Film_pojo("داش آکل", "ماندانا,آزادی,کوروش,ملت", getResources().getDrawable(R.drawable.dashakol), "محمد عرب", "90");
        Film_pojo jadeghadim = new Film_pojo("جاده قدیم", "ماندانا,آزادی,کوروش,ملت", getResources().getDrawable(R.drawable.jadeghadim), "منیژه حکمت", "90");
        Film_pojo sholevar = new Film_pojo("شعله ور", "ماندانا,آزادی,کوروش,ملت", getResources().getDrawable(R.drawable.sholevar), "حمید نعمت الله", "90");
        Film_pojo filshah = new Film_pojo("فیل شاه", "ماندانا,آزادی,کوروش,ملت", getResources().getDrawable(R.drawable.filshah), "هادی محمدیان", "90");
        filmpojo.add(hezarpa);
        filmpojo.add(katiusha);
        filmpojo.add(latari);
        filmpojo.add(dashakol);
        filmpojo.add(jadeghadim);
        filmpojo.add(sholevar);
        filmpojo.add(filshah);
        filmpojo.add(tangeabooghoraib);
        RecyclerFilmsAdapter adapter = new RecyclerFilmsAdapter(FeaturedVideosActivity.this, filmpojo);
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recycler_films_featured.setAdapter(adapter);
        recycler_films_featured.setLayoutManager(manager);
    }
}

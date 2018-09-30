package test.application.ivote;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import test.application.ivote.Recycler_actor_main.ActorPojoMen;
import test.application.ivote.Recycler_actor_main.ActorPojoWoman;
import test.application.ivote.Recycler_actor_main.Drawer.ListDrawerAdapter;
import test.application.ivote.Recycler_actor_main.Drawer.PojoListDrawer;
import test.application.ivote.Recycler_actor_main.Recycler_men_Adapter;
import test.application.ivote.Recycler_actor_main.Recycler_woman_adapter;
import test.application.ivote.Recycler_fims_main.Film_pojo;
import test.application.ivote.Recycler_fims_main.RecyclerFilmsAdapter;


public class MainActivity extends AppCompatActivity {
    RecyclerView recycler_actor;
    RecyclerView recycler_actor_woman;
    DrawerLayout drawer;
    ImageView iconmenu;
    ListView listview_drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind();
        createDataActorMen();
        createDataActorWomen();
        drawer();
        createDataDrawer();

    }

    void bind() {

        recycler_actor = findViewById(R.id.recycler_actor);
        recycler_actor_woman = findViewById(R.id.recycler_actor_woman);
        drawer = findViewById(R.id.my_drawer_layout);
        iconmenu = findViewById(R.id.menuicon);
        listview_drawer = findViewById(R.id.listview_drawer);

    }




    void createDataActorMen() {
        List<ActorPojoMen> actorPojoMen = new ArrayList<>();
        ActorPojoMen javadezzati = new ActorPojoMen(getResources().getDrawable(R.drawable.javadezzati), "جواد عزتی", "تنگه ابوالقریب و هزار پا");
        ActorPojoMen hadihejazifar = new ActorPojoMen(getResources().getDrawable(R.drawable.hadihejazi), "هادی حجازی فر", "لاتاری");
        ActorPojoMen ahmadmehranfar = new ActorPojoMen(getResources().getDrawable(R.drawable.ahmadmehranfar), "احمد مهران فر", "کاتیوشا");
        ActorPojoMen aminhayaii = new ActorPojoMen(getResources().getDrawable(R.drawable.aminhayaii), "امین حیایی", "شعله ور");
        ActorPojoMen hosseinyari = new ActorPojoMen(getResources().getDrawable(R.drawable.hosseinyari), "حسین یاری", "داش آکل");
        ActorPojoMen rezaattaran = new ActorPojoMen(getResources().getDrawable(R.drawable.rezaattaran), "رضا عطاران", "هزار پا");
        ActorPojoMen mahdipakdel = new ActorPojoMen(getResources().getDrawable(R.drawable.mehdipakdel), "مهدی پاکدل", "تنگه ابوقریب");
        ActorPojoMen amirjadidi = new ActorPojoMen(getResources().getDrawable(R.drawable.amirjadidi), "امیرجدیدی", "تنگه ابوقریب");
        actorPojoMen.add(javadezzati);
        actorPojoMen.add(hadihejazifar);
        actorPojoMen.add(ahmadmehranfar);
        actorPojoMen.add(aminhayaii);
        actorPojoMen.add(hosseinyari);
        actorPojoMen.add(rezaattaran);
        actorPojoMen.add(mahdipakdel);
        actorPojoMen.add(amirjadidi);
        Recycler_men_Adapter adapter = new Recycler_men_Adapter(MainActivity.this, actorPojoMen);
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, true);
        recycler_actor.setAdapter(adapter);
        recycler_actor.setLayoutManager(manager);


    }


    void createDataActorWomen() {
        List<ActorPojoWoman> actorPojoWomen = new ArrayList<>();
        ActorPojoWoman mahtabkeramati = new ActorPojoWoman(getResources().getDrawable(R.drawable.mahtabkeramati), "مهتاب کرامتی", "جاده قدیم");
        ActorPojoWoman heliaemami = new ActorPojoWoman(getResources().getDrawable(R.drawable.heliaemami), "هلیا امامی", "داش آکل");
        ActorPojoWoman sarabahrami = new ActorPojoWoman(getResources().getDrawable(R.drawable.sarabahrami), "سارا بهرامی", "هزارپا");
        ActorPojoWoman mitrahajar = new ActorPojoWoman(getResources().getDrawable(R.drawable.mitrahajar), "میترا حجار", "کاتیوشا");
        ActorPojoWoman leilaotadi = new ActorPojoWoman(getResources().getDrawable(R.drawable.leilaotadi), "لیلا اوتادی", "کاتیوشا");
        ActorPojoWoman hodazein = new ActorPojoWoman(getResources().getDrawable(R.drawable.hoda), "هدی زین العابدین", "جاده قدیم");
        actorPojoWomen.add(mahtabkeramati);
        actorPojoWomen.add(heliaemami);
        actorPojoWomen.add(sarabahrami);
        actorPojoWomen.add(mitrahajar);
        actorPojoWomen.add(leilaotadi);
        actorPojoWomen.add(hodazein);
        Recycler_woman_adapter adapter = new Recycler_woman_adapter(MainActivity.this, actorPojoWomen);
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, true);
        recycler_actor_woman.setAdapter(adapter);
        recycler_actor_woman.setLayoutManager(manager);


    }

    void createDataDrawer() {
        List<PojoListDrawer> pojolistdrawer = new ArrayList<>();
        PojoListDrawer list = new PojoListDrawer("دسته بندی ", getResources().getDrawable(R.drawable.listicon));
        PojoListDrawer bestactor = new PojoListDrawer("بازیگران برگزیده ", getResources().getDrawable(R.drawable.actoricon));
        PojoListDrawer bestmovie = new PojoListDrawer("فیلم های برگزیده ", getResources().getDrawable(R.drawable.movieicon));
        PojoListDrawer voted = new PojoListDrawer("نظرهای داده شده ", getResources().getDrawable(R.drawable.likeicon));


        pojolistdrawer.add(voted);
        pojolistdrawer.add(bestactor);
        pojolistdrawer.add(bestmovie);
        pojolistdrawer.add(list);
        ListDrawerAdapter adapter=new ListDrawerAdapter(MainActivity.this,pojolistdrawer);
         listview_drawer.setAdapter(adapter);
    }

    void drawer() {
        iconmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(Gravity.END);
            }
        });

    }
}

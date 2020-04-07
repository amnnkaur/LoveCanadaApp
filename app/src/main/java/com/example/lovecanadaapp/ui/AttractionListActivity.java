package com.example.lovecanadaapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.lovecanadaapp.R;
import com.example.lovecanadaapp.adapter.MyAdapter;
import com.example.lovecanadaapp.model.CanadaAttraction;

import java.util.ArrayList;

public class AttractionListActivity extends AppCompatActivity {

    private RecyclerView rvPlaceList;
    private ArrayList<CanadaAttraction> placeArrayList;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_list);

        rvPlaceList = findViewById(R.id.rvPlaceList);

        populatePlaces();

        myAdapter = new MyAdapter(placeArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false);
        rvPlaceList.setLayoutManager(layoutManager);
        rvPlaceList.setAdapter(myAdapter);

    }

    public void populatePlaces(){
        placeArrayList = new ArrayList<>();

        placeArrayList.add(new CanadaAttraction(1,"Niagara Falls", "6650 Niagara Parkway. (River Rd) Niagara Falls, ON L2G 0L0","Hamilton", "Ontario","Canada's most famous natural attraction, the majestic Niagara Falls has been drawing sightseers almost since its discovery. The great wall of water pounding over the falls is an amazing sight, and the view and access afforded visitors is astounding. You can literally walk up to the edge of the falls, separated only by a cast iron railing, and see the water as it disappears over the crest.",R.drawable.niagara));
        placeArrayList.add(new CanadaAttraction(2,"CN Tower", "301 Front St W, Toronto, ON M5V 2T6","Toronto", "Ontario","Toronto's famous landmark, the 553-meter CN Tower, is one of the city's must see attractions and also the most impossible to miss. Towering above the downtown, this Canadian icon can be seen from almost everywhere in the city. You have the option of simply appreciating the building from the ground, or taking a trip up to one of the observation areas or restaurants for fabulous views over the city and Lake Ontario.",R.drawable.cntower));
        placeArrayList.add(new CanadaAttraction(3,"Whistler", "North of Vancouver","Vancouver", " British Columbia","Whistler has long been known as a world-class ski destination and was the site of many of the skiing events during the 2010 Winter Olympics hosted by Vancouver. Despite this reputation, Whistler is an equally impressive and popular summer destination, with hiking, biking, golfing, and many other activities on offer.",R.drawable.whistler));
        placeArrayList.add(new CanadaAttraction(4,"Banff National Park", "Improvement District No. 9, AB T0L","Canmore", "Alberta","The charming mountain town of Banff, in the stunning Banff National Park, is a must-visit destination for anyone looking to explore the Rocky Mountains and see some of the most beautiful scenery in Canada. This is undeniably a tourist town, catering to international travelers from all over the globe.",R.drawable.ban));
        placeArrayList.add(new CanadaAttraction(5,"Old Montreal", "Old Montreal, QC","Montreal", "Quebec","Old-world charm, spectacular buildings, and horse-drawn carriages are pretty much what describes the fascinating aura of this oldest area in Montreal. For travelers in pursuit of a peaceful & unique experience, this is the perfect place to be!",R.drawable.old));
        placeArrayList.add(new CanadaAttraction(6,"Jasper National Park", "Jasper, AB T0E 1E0","Hinton", "Alberta","Jasper National park is home to many turquoise lakes and peaks that are worth capturing for your social media accounts. The views will appease your adventurous soul as well as put you into a state of euphoria.",R.drawable.jasper));
        placeArrayList.add(new CanadaAttraction(7,"Ripley's Aquarium of Canada", "288 Bremner Boulevard, Toronto","Toronto", "Ontario","One of Toronto's newest top attractions is the Ripley's Aquarium near the base of the CN Tower. This fabulous facility displays all kinds of marine life and is one of the most popular things to do in Toronto for families.The most impressive feature is the huge underwater tunnel with a moving sidewalk. You can watch the ocean world go by all around you as sharks glide past and sawfish linger on the tunnel roof above.",R.drawable.ripley));
        placeArrayList.add(new CanadaAttraction(8,"Stanley Park", "Vancouver, BC V6G 1Z4","Vancouver", " British Columbia","Stanley Park is Vancouver's premier park at 405 hectares. It sits at the western tip of the Downtown peninsula within walking distance of office towers and shopping. This proximity to the city makes Stanley Park's giant centuries-old red cedar and Douglas fir trees all the more lovely. Originally earmarked for repairs to British navy sailing ships, these huge trees escaped the woodcutter's axe and were preserved as part of the park in 1888. Forested paths crisscross the park, leading to attractions and restaurants.",R.drawable.stan));
        placeArrayList.add(new CanadaAttraction(9,"churchill", "West shore of Hudson Bay","Northern Manitoba", "Manitoba","This small town located on Hudson Bay definitely counts as one of the top places to visit in Canada. Known as the polar bear capital of the world, Churchills is the perfect hotspot for travelers who love having a close encounter with wildlife. It is also a great destination for adventure seekers and one can enjoy underwater activities here",R.drawable.ch));
        placeArrayList.add(new CanadaAttraction(10,"Bay of Fundy", "New Brunswick, Canada","Nova Scotia", "Maine","The Bay of Fundy is a bay between the Canadian provinces of New Brunswick and Nova Scotia, with a small portion touching the US state of Maine. It has an extremely high tidal range. The name is likely a corruption of the French word Fendu, meaning split",R.drawable.bayfundy));
        placeArrayList.add(new CanadaAttraction(11,"Quebec City", "Quebec","Quebec", "Quebec","Québec City is loaded with history and located in the French-speaking province of Québec. This is the provincial capital and a city with a history dating back to the early 1600s. The old buildings and curving cobbled streets make this one of Canada's most charming capital cities.",R.drawable.qbc));
        placeArrayList.add(new CanadaAttraction(12,"St. Johns", "Newfoundland island","Newfoundland island", "Newfoundland and Labrador","Popular for its jelly beaned & crayon colored houses, and being an artist’s retreat, St. John’s is like a mini San Francisco. Colorful buildings line the sloping streets that run along hills, with views out over the harbor. The city also has numerous historic sites and attractions, including Signal Hill and George Street, but the real appeal is the vibrant atmosphere, the people, and the maritime culture that makes this city so unique from mainland Canada.",R.drawable.st));
        placeArrayList.add(new CanadaAttraction(13,"Royal Ontario Museum", "100 Queen's Park, Toronto","Toronto", "Ontario","The Royal Ontario Museum, known as the ROM, is one of Canada's premier museums, with an international reputation for excellence. It houses an outstanding collection, which covers natural history, art, and culture from a great variety of periods from all over the world. It is also well-known for featuring exhibitions from across the globe.",R.drawable.royalmuseum));
        placeArrayList.add(new CanadaAttraction(14,"City Hall & Nathan Philips Square", "100 Queen Street West, Toronto","Toronto", "Ontario"," Dominating the spacious Nathan Philips Square with its bronze sculpture, The Archer, by Henry Moore, is the still highly acclaimed new City Hall. It was designed by the gifted Finnish architect Viljo Revell and built in 1965. n the square in front of City Hall is a man-made pond, which becomes a popular skating rink in winter and is where the often photographed Toronto sign is located.",R.drawable.cityhall));
        placeArrayList.add(new CanadaAttraction(15,"Hornby Island", "2115 Sollans Road, Hornby Island","Hornby Island", "British Columbia","Hornby Island is a rural, simple, relaxed and incredibly beautiful island located in the calm waters of Georgia Strait in Salish Sea between Vancouver Island and the mainland. The island has lots of calm waters, sandy beaches, lush forests, and miles of hiking trails bringing a huge number of tourists as it is one of the best places to visit in Canada.",R.drawable.hor));

    }
}

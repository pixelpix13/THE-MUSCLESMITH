package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Bakked Eggs","6 to 8 medium russet potatoes" +
                "Salt and ground pepper"+
                "Nonstick cooking spray"+
                "24 large eggs"
                ,"Method",
                "Preheat the oven to 400 degrees F. \n" +
                        "Bake the potatoes until tender, 45 minutes to 1 hour. Allow to cool, and then peel and grate them. Season well with salt and pepper.\n" +
                        "Adjust the oven temperature to 450 degrees F. Spray two 12-hole muffin pans generously with cooking spray. Scoop 3 to 4 tablespoons of grated potato into each muffin hole. Use your fingers to gently press down the sides and bottom in each muffin hole to make a nest. Spray again with cooking spray. Then bake for 15 to 20 minutes. Watch and make sure they do not burn.\n" +
                        "Allow the nests to cool and lower the oven temperature to 400 degrees F. Then crack an egg into each nest. Sprinkle with salt and pepper and bake until the whites are set, about 15 minutes.",R.drawable.bakkedeggs));

                recipes1.add(new Recipes("Pumpkin Seed Dried Cherry Trail Mix","2 cups baby pumpkin seeds (pepitas)"+
                        "1 cup slivered almonds" +
                        "3/4 cup raw sunflower seeds"+
                        "6 tablespoons pure Grade B maple syrup" +
                        "Coarse salt"+
                        "1 cup dried cherries or cranberries","Method","\n" +
                "Preheat the oven to 300 degrees F. Line 2 baking sheets with parchment paper or silicone baking mats."+" \"In a large bowl, toss the pumpkin seeds, almonds, and sunflower seeds and the syrup until evenly coated. Spread the nuts and seeds out, in an even single layer, on the lined baking sheets and season with salt to taste. Bake the nuts, stirring several times with spatula or wooden spoon, until just golden, about 20 minutes."
                        +"\"Cool the nuts completely on the pan, then add the cherries and toss to combine. Store cooled trail mix in an airtight container at room temperature.",R.drawable.psdctm));

        recipes1.add(new Recipes("Dosa","3 cups rice" +
                "1 cup urad daal (split, skinless black gram)" +
                "3/4 teaspoon fenugreek seeds" +
                "Salt (to taste)" +
                "Vegetable / canola / sunflower cooking oil","Method",
                "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                        "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                        "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                        "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.dosa1));
        recipes1.add(new Recipes("Pancake","1 1/4 cups milk" +
                "1 egg" +
                "3 tablespoons butter melted" +
                "1 1/2 cups all-purpose flour" +
                "3 1/2 teaspoons baking powder" +
                "1 teaspoon salt" +
                "1 tablespoon white sugar","Method",
                "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth." +
                        "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.",R.drawable.pancakes));
        recipes1.add(new Recipes("Pasta","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely." +
                        "now add 2 tbsp corn, ¼ capsicum, ¼ carrot, 2 tbsp peas and 7 florets broccoli. saute for a minute." +
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well." +
                        "finally, serve masala pasta indian style hot topped with cheese if required.",R.drawable.pasta1));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);
    }
}
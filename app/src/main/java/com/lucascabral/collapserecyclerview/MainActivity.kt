package com.lucascabral.collapserecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lucascabral.collapserecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieList = initData()
        initRecyclerView(movieList)
    }

    private fun initRecyclerView(movieList: List<Movie>) {
        binding.movieRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MovieAdapter(movieList)
        }
    }

    private fun initData(): List<Movie> {
        return listOf(
            Movie(
                "Iron Man",
                "7.9",
                "2008",
                "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil."
            ),
            Movie(
                "The Incredible Hulk",
                "6.7",
                "2008",
                "Bruce Banner, a scientist on the run from the U.S. Government, must find a cure for the monster he turns into, whenever he loses his temper."
            ),
            Movie(
                "Iron Man 2",
                "7.0",
                "2010",
                "With the world now aware of his identity as Iron Man, Tony Stark must contend with both his declining health and a vengeful mad man with ties to his father's legacy."
            ),
            Movie(
                "Thor",
                "7.0",
                "2011",
                "The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders."
            ),
            Movie(
                "Captain America: The First Avenger",
                "6.9",
                "2011",
                "Steve Rogers, a rejected military soldier transforms into Captain America after taking a dose of a Super-Soldier serum. But being Captain America comes at a price as he attempts to take down a war monger and a terrorist organization."
            ),
            Movie(
                "The Avengers",
                "8.0",
                "2012",
                "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity."
            ),
            Movie(
                "Iron Man 3",
                "7.2",
                "2013",
                "When Tony Stark's world is torn apart by a formidable terrorist called the Mandarin, he starts an odyssey of rebuilding and retribution."
            ),
            Movie(
                "Thor: The Dark World",
                "6.9",
                "2013",
                "When the Dark Elves attempt to plunge the universe into darkness, Thor must embark on a perilous and personal journey that will reunite him with doctor Jane Foster."
            ),
            Movie(
                "Captain America: The Winter Soldier",
                "7.8",
                "2014",
                "As Steve Rogers struggles to embrace his role in the modern world, he teams up with a fellow Avenger and S.H.I.E.L.D agent, Black Widow, to battle a new threat from history: an assassin known as the Winter Soldier."
            ),
            Movie(
                "Avengers: Age of Ultron",
                "7.3",
                "2015",
                "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's mightiest heroes to stop the villainous Ultron from enacting his terrible plan."
            ),
            Movie(
                "Ant-Man",
                "7.3",
                "2015",
                "Armed with a super-suit with the astonishing ability to shrink in scale but increase in strength, cat burglar Scott Lang must embrace his inner hero and help his mentor, Dr. Hank Pym, plan and pull off a heist that will save the world."
            ),
            Movie(
                "Captain America: Civil War",
                "7.8",
                "2016",
                "Political involvement in the Avengers' affairs causes a rift between Captain America and Iron Man."
            ),
            Movie(
                "Thor: Ragnarok",
                "7.9",
                "2017",
                "Thor (Chris Hemsworth) is imprisoned on the planet Sakaar, and must race against time to return to Asgard and stop Ragnarök, the destruction of his world, at the hands of the powerful and ruthless villain Hela (Cate Blanchett)."
            ),
            Movie(
                "Black Panther",
                "7.3",
                "2018",
                "T'Challa, heir to the hidden but advanced kingdom of Wakanda, must step forward to lead his people into a new future and must confront a challenger from his country's past."
            ),
            Movie(
                "Avengers: Infinity War",
                "8.5",
                "2018",
                "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe."
            ),
            Movie(
                "Ant-Man and the Wasp",
                "7.1",
                "2018",
                "As Scott Lang balances being both a Super Hero and a father, Hope van Dyne and Dr. Hank Pym present an urgent new mission that finds the Ant-Man fighting alongside The Wasp to uncover secrets from their past."
            ),
            Movie(
                "Avengers: Endgame",
                "8.5",
                "2019",
                "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe."
            )
        )
    }
}
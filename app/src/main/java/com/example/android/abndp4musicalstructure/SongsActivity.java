package com.example.android.abndp4musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * SongList Activity class
 *
 * @author Jakub
 * @date 2018/03/24
 */

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        int position = getIntent().getIntExtra("mSongAuthor", 0);

        // Create a list of songs
        ArrayList<SongList> songs = new ArrayList<SongList>();
        switch (position) {
            case 0:
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_rocknroll), getString(R.string.str_acdc_dur01)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_gimme), getString(R.string.str_acdc_dur02)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_down), getString(R.string.str_acdc_dur03)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_gone_shootin), getString(R.string.str_acdc_dur04)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_riff_raff), getString(R.string.str_acdc_dur05)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_sin_city), getString(R.string.str_acdc_dur06)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_up_to_my_neck), getString(R.string.str_acdc_dur07)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_whats_next), getString(R.string.str_acdc_dur08)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_cold_hearted_man), getString(R.string.str_acdc_dur09)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_acdc), getString(R.string.str_acdc_kicked), getString(R.string.str_acdc_dur10)));
                break;

            case 1:
                songs.clear();
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_get_out), getString(R.string.str_fnm_dur01)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_ricochet), getString(R.string.str_fnm_dur02)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_evidence), getString(R.string.str_fnm_dur03)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_the_gentle_art), getString(R.string.str_fnm_dur04)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_star), getString(R.string.str_fnm_dur05)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.cuckoo), getString(R.string.str_fnm_dur06)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_caralho), getString(R.string.str_fnm_dur07)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_ugly_in_the_morning), getString(R.string.str_fnm_dur08)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_digging_the_grave), getString(R.string.str_fnm_dur09)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_take_this_bottle), getString(R.string.str_fnm_dur10)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_king_for_a_day), getString(R.string.str_fnm_dur11)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_what_a_day), getString(R.string.str_fnm_dur12)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_the_last_to_know), getString(R.string.str_fnm_dur13)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_just_a_man), getString(R.string.str_fnm_dur14)));
                break;

            case 2:
                songs.clear();
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_wheels_of_fire), getString(R.string.str_mnw_dur01)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_kings_of_metal), getString(R.string.str_mnw_dur02)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_hearts_of_steel), getString(R.string.str_mnw_dur03)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_sting), getString(R.string.str_mnw_dur04)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_the_crown), getString(R.string.str_mnw_dur05)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_kingdom_come), getString(R.string.str_mnw_dur06)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_pleasure), getString(R.string.str_mnw_dur07)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_hail_and_kill), getString(R.string.str_mnw_dur08)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_warriors_prayer), getString(R.string.str_mnw_dur09)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_manowar), getString(R.string.str_mnw_blood_of_the_kings), getString(R.string.str_mnw_dur10)));
                break;

            case 3:
                songs.clear();
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.str_qr_metal_health), getString(R.string.str_qr_dur01)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.str_qr_cum_on), getString(R.string.str_qr_dur02)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.dont_wanna), getString(R.string.str_qr_dur03)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.str_qr_cadillac), getString(R.string.str_qr_dur04)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.str_qr_loves_a_bitch), getString(R.string.str_qr_dur05)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.str_qr_breathless), getString(R.string.str_qr_dur06)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.str_qr_run_for_cover), getString(R.string.str_qr_dur07)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.str_qr_battle_axe), getString(R.string.str_qr_dur08)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.str_qr_lets_get_crazy), getString(R.string.str_qr_dur09)));
                songs.add(new SongList(R.drawable.ic_play_circle_outline, getString(R.string.str_auth_qr), getString(R.string.str_qr_thunderbird), getString(R.string.str_qr_dur10)));
                break;
            default:
        }

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link songs}. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);

    }
}

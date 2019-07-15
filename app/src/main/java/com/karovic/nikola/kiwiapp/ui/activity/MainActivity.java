package com.karovic.nikola.kiwiapp.ui.activity;


import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.karovic.nikola.kiwiapp.R;
import com.karovic.nikola.kiwiapp.ui.fragment.FlightOfferFragment;
import com.karovic.nikola.kiwiapp.ui.viewmodel.FlightOffersViewModel;
import com.karovic.nikola.kiwiapp.ui.viewmodel.ViewModelFactory;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

import static com.karovic.nikola.kiwiapp.utils.StringUtils.currentDate;
import static com.karovic.nikola.kiwiapp.utils.StringUtils.getNextMonthDate;

public class MainActivity extends DaggerAppCompatActivity {

    //ViewModel
    @Inject
    ViewModelFactory viewModelFactory;
    FlightOffersViewModel flightOffersViewModel;

    //UI References
    ViewPager flightOffersViewPager;
    SpringDotsIndicator springDotsIndicator;
    ProgressBar flightProgressBar;
    TextView flightsOffersTitleTV;


    @Override
    protected void onStart() {
        super.onStart();
        flightOffersViewModel.getFlightOffersForDay();
        flightOffersViewModel.getFlightsOffers(currentDate(), getNextMonthDate());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flightOffersViewModel = ViewModelProviders.of(this, viewModelFactory).get(FlightOffersViewModel.class);

        flightOffersViewModel.getFlightOffersForDay();
        flightOffersViewModel.getFlightsOffers(currentDate(), getNextMonthDate());

        init();
    }

    private void init() {
        getUIReferences();
        setProgressBar();
    }

    private void setProgressBar() {
        flightOffersViewModel.state.observe(this, viewModelState -> {
            if (viewModelState != null) {
                switch (flightOffersViewModel.state.getValue()) {
                    case LOADING: {
                        flightProgressBar.setVisibility(View.VISIBLE);
                        flightOffersViewPager.setVisibility(View.GONE);
                        springDotsIndicator.setVisibility(View.GONE);
                        flightsOffersTitleTV.setVisibility(View.GONE);
                        break;
                    }
                    case SUCCESS: {
                        flightProgressBar.setVisibility(View.GONE);
                        flightOffersViewPager.setVisibility(View.VISIBLE);
                        springDotsIndicator.setVisibility(View.VISIBLE);
                        flightsOffersTitleTV.setVisibility(View.VISIBLE);
                        break;
                    }
                    case FAILURE: {
                        flightProgressBar.setVisibility(View.GONE);
                        flightOffersViewPager.setVisibility(View.GONE);
                        springDotsIndicator.setVisibility(View.GONE);
                        break;
                    }
                    default:
                        flightProgressBar.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void getUIReferences() {
        flightOffersViewPager = findViewById(R.id.flights_details_view_pager);
        springDotsIndicator = findViewById(R.id.flights_details_spring_dots_indicator);
        springDotsIndicator.setViewPager(flightOffersViewPager);
        flightProgressBar = findViewById(R.id.flights_offers_progress_bar);
        flightsOffersTitleTV = findViewById(R.id.flights_offers_title);

        FragmentManager fragmentManager = getSupportFragmentManager();

        flightOffersViewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                return FlightOfferFragment.newInstance(position);
            }

            @Override
            public int getCount() {
                return 5;
            }
        });
    }


}

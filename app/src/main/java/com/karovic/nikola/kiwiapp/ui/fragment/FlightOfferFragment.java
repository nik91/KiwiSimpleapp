package com.karovic.nikola.kiwiapp.ui.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.karovic.nikola.kiwiapp.BuildConfig;
import com.karovic.nikola.kiwiapp.R;
import com.karovic.nikola.kiwiapp.rest.model.flightoffers.FlightData;
import com.karovic.nikola.kiwiapp.ui.viewmodel.FlightOffersViewModel;
import com.karovic.nikola.kiwiapp.ui.viewmodel.ViewModelFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

import static com.karovic.nikola.kiwiapp.utils.StringUtils.getDateFromSeconds;

public class FlightOfferFragment extends DaggerFragment {

    @Inject
    ViewModelFactory viewModelFactory;

    FlightOffersViewModel flightOffersViewModel;

    //UI References
    ImageView cityImage;
    TextView flightOffersPrice;
    TextView flightOffersDestination;
    TextView flightOffersDate;
    TextView flightOffersStopOversTitle;
    TextView flightOffersNumberOfStopOvers;

    public static final String ARG_FLIGHT_OFFER_ID = "FlightOfferFragmentID";

    public static FlightOfferFragment newInstance(int offerId) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_FLIGHT_OFFER_ID, offerId);
        FlightOfferFragment fragment = new FlightOfferFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        flightOffersViewModel = ViewModelProviders.of(getActivity(), viewModelFactory).get(FlightOffersViewModel.class);
        View view = inflater.inflate(R.layout.fragment_flight_offer, container, false);

        setUIReferences(view);

        flightOffersViewModel.flightDataMutableLiveData.observe(this, flightData -> {
            if (!flightData.isEmpty()) {
                if (flightData.get(getArguments().getInt("FlightOfferFragmentID")) != null) {
                    FlightData flight = flightData.get(getArguments().getInt("FlightOfferFragmentID"));
                    setFragmentContent(flight);
                }
            }
        });
        return view;
    }

    private void setUIReferences(View view) {
        cityImage = view.findViewById(R.id.flight_offers_image);
        flightOffersPrice = view.findViewById(R.id.flight_offers_price);
        flightOffersDestination = view.findViewById(R.id.flight_offers_destination);
        flightOffersDate = view.findViewById(R.id.flight_offers_date);
        flightOffersStopOversTitle = view.findViewById(R.id.flight_offers_stopovers_title);
        flightOffersNumberOfStopOvers = view.findViewById(R.id.flight_offers_stopovers);
    }

    private void setFragmentContent(FlightData flight) {
        flightOffersDestination.setText(flight.getCityTo());
        flightOffersPrice.setText("\u20ac" + flight.getPrice());

        flightOffersDate.setText(getDateFromSeconds(flight.getDTime().toString()));

        if (flight.getRoute().size() > 1) {
            flightOffersStopOversTitle.setVisibility(View.VISIBLE);
            flightOffersNumberOfStopOvers.setVisibility(View.VISIBLE);
            flightOffersNumberOfStopOvers.setText(flight.getRoute().size() - 1 + " Stopovers");
        } else {
            flightOffersStopOversTitle.setVisibility(View.GONE);
            flightOffersNumberOfStopOvers.setVisibility(View.GONE);
        }
        RequestOptions options = new RequestOptions()
                .skipMemoryCache(false)
                .centerCrop()
                .error(R.drawable.img_blank);

        Glide.with(getContext())
                .load(BuildConfig.IMAGES_URL + "/" + flight.getMapIdto() + ".jpg")
                .apply(options)
                .into(cityImage);
    }

}

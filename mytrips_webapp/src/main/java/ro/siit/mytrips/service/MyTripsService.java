package ro.siit.mytrips.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.siit.mytrips.model.MyTrips;
import ro.siit.mytrips.model.MyTripsRepository;

@Service
public class MyTripsService {

    @Autowired
    MyTripsRepository myTripsRepository;

    public Iterable<MyTrips> getAllTrips(){
        return myTripsRepository.findAll();
    }

    public void saveTrip(MyTrips myTrip){
        myTripsRepository.save(myTrip);
    }
}

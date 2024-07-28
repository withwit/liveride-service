package oyetaxi.liveride_service.service;

public class Temp {
}
//
//package com.example.taxi.service;
//
//import org.locationtech.jts.geom.Coordinate;
//import org.locationtech.jts.geom.Envelope;
//import org.locationtech.jts.index.strtree.STRtree;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class RTreeService {
//
//    private STRtree rTree;
//
//    @PostConstruct
//    public void init() {
//        rTree = new STRtree();
//    }
//
//    public void addDriver(long driverId, double latitude, double longitude) {
//        Coordinate coordinate = new Coordinate(latitude, longitude);
//        rTree.insert(new Envelope(coordinate), driverId);
//    }
//
//    public void updateDriverLocation(long driverId, double latitude, double longitude) {
//        deleteDriver(driverId);
//        addDriver(driverId, latitude, longitude);
//    }
//
//    public void deleteDriver(long driverId) {
//        // Find and remove the driver from the R-Tree (simplified for example purposes)
//        // In a real implementation, you would store the driver locations separately to efficiently remove them
//        rTree = new STRtree();
//    }
//
//    public List<Long> findNearbyDrivers(double latitude, double longitude, double radius) {
//        Envelope searchEnv = new Envelope(
//                new Coordinate(latitude - radius, longitude - radius),
//                new Coordinate(latitude + radius, longitude + radius)
//        );
//        return (List<Long>) rTree.query(searchEnv).stream().collect(Collectors.toList());
//    }
//}

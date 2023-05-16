package web.service;

import web.dao.CarDao;
import web.models.Car;

import java.util.List;


public class CarService {

    CarDao carDao = new CarDao();

    public List<Car> getCars(Integer count) {
        if (count == null) {
            return carDao.getCars(10);
        } else {
            return carDao.getCars(count);
        }
    }
}

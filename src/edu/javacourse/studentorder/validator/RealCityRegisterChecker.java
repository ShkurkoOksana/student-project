package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.register.CityRegisterResponce;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.exception.TransportException;

public class RealCityRegisterChecker implements CityRegisterChecker{
    public CityRegisterResponce checkPerson(Person person) throws CityRegisterException, TransportException {
        return null;
    }
}

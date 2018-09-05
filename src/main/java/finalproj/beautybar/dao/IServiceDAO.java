package finalproj.beautybar.dao;

import finalproj.beautybar.entity.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceDAO {

    List<Service> findAll() throws Exception;
    //List<Service> findAllByServiceType(String serviceTypeName) throws Exception;
    Service findEntityById(Long id) throws Exception;
    Service findEntityByName(String name);
    Boolean delete(Long id) throws Exception;
    Boolean create(Service entity) throws Exception;
    Service update(Service entity) throws SQLException;

}

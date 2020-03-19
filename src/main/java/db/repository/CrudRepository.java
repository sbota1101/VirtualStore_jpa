package db.repository;



import java.util.List;
import java.util.Optional;

public interface CrudRepository<T,K> {//folosim generic pt obiecte,parametrizam cu generic

    List<T> findAll();

    T save(T o);//insert si update all together

    T deleteById(K id);
    Optional<T> findById(K id);
}

package tech.ada.farchettiensis.booksapi.repository;

import java.util.List;

// TODO: revisar se essa interface será necessária
public interface CrudRepository<T, I> {

    T create(T entity);

    T read(I id);

    T update(T entity);

    void delete(I id);

    List<T> createBatch(List<T> entities);

    List<T> updateBatch(List<T> entities);

    void deleteBatch(List<I> ids);
}



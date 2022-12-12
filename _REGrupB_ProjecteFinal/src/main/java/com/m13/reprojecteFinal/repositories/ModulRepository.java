<<<<<<< HEAD

=======
>>>>>>> a6b46a89c441f59e64d062df8b0f5f383a655a38
package com.m13.reprojecteFinal.repositories;

import com.m13.reprojecteFinal.entity.Modul;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ModulRepository extends CrudRepository<Modul,Long> {
    public List<Modul> findAll();
<<<<<<< HEAD
}
=======

}
>>>>>>> a6b46a89c441f59e64d062df8b0f5f383a655a38

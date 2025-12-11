
package com.mycompany.ibarra.gimena.rec.pp.progii321;

/**
 *
 * @author ibarr
 */
public interface AccionDespegar{
    /*Solo puede ser ejecutado por CazaLigero y CazaPesado.
        Ejecuta la acción para los cazas que la tengan permitida.
        En caso contrario, debe informarse que el caza no puede despegar.
    */
    void despegar();
}

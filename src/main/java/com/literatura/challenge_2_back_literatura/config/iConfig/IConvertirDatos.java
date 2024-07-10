package com.literatura.challenge_2_back_literatura.config.iConfig;

public interface IConvertirDatos {

    <T> T convertirDatosJsonAJava(String json , Class<T> clase); //metodo que agarra el json y convierte en datos Java ya que no se sabe que retornara

}

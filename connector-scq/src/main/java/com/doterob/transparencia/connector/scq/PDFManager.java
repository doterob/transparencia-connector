package com.doterob.transparencia.connector.scq;

import com.doterob.transparencia.model.Contract;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by dotero on 06/05/2016.
 */
public interface PDFManager {

    List<Contract> extract() throws IOException, URISyntaxException;

    String toText() throws IOException, URISyntaxException;
}

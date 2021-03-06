package com.doterob.transparencia.connector.contract.extractor.pdf;

import com.doterob.transparencia.model.ContractComplex;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by dotero on 06/05/2016.
 */
public interface PDFManager {

    List<ContractComplex> extract() throws IOException, URISyntaxException;

    String testToText() throws IOException, URISyntaxException;
}

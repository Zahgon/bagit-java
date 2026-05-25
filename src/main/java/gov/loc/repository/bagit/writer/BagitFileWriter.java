package gov.loc.repository.bagit.writer;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gov.loc.repository.bagit.domain.Version;

/**
 * Responsible for writing the bagit.txt to the filesystem
 */
public final class BagitFileWriter {

    private static final Logger logger = LoggerFactory.getLogger(BagitFileWriter.class);

    private static final ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    private BagitFileWriter() {
        //intentionally left empty
    }

    /**
     * Write the bagit.txt file in required UTF-8 encoding.
     *
     * @param version the version of the bag to write out
     * @param encoding the encoding of the tag files
     * @param outputDir the root of the bag
     *
     * @throws IOException if there was a problem writing the file
     */
    public static void writeBagitFile(final Version version, final Charset encoding, final Path outputDir) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

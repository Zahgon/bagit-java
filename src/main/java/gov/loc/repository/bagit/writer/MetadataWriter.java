package gov.loc.repository.bagit.writer;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ResourceBundle;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gov.loc.repository.bagit.domain.Metadata;
import gov.loc.repository.bagit.domain.Version;

/**
 * Responsible for writing out the bag {@link Metadata} to the filesystem
 */
public final class MetadataWriter {

    private static final Logger logger = LoggerFactory.getLogger(MetadataWriter.class);

    private static final Version VERSION_0_95 = new Version(0, 95);

    private static final ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    private MetadataWriter() {
        //intentionall left empty
    }

    /**
     * Write the bag-info.txt (or package-info.txt) file to the specified outputDir with specified encoding (charsetName)
     *
     * @param metadata the key value pair info in the bag-info.txt file
     * @param version the version of the bag you are writing
     * @param outputDir the root of the bag
     * @param charsetName the name of the encoding for the file
     *
     * @throws IOException if there was a problem writing a file
     */
    public static void writeBagMetadata(final Metadata metadata, final Version version, final Path outputDir, final Charset charsetName) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

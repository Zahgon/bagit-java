package gov.loc.repository.bagit.hash;

import java.util.Locale;
import java.util.ResourceBundle;
import gov.loc.repository.bagit.exceptions.UnsupportedAlgorithmException;

/**
 * Provides a mapping between bagit algorithm names and {@link SupportedAlgorithm}
 */
public class StandardBagitAlgorithmNameToSupportedAlgorithmMapping implements BagitAlgorithmNameToSupportedAlgorithmMapping {

    private static final ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    @Override
    public SupportedAlgorithm getSupportedAlgorithm(final String bagitAlgorithmName) throws UnsupportedAlgorithmException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

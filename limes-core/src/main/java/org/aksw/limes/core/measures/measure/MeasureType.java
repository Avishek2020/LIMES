package org.aksw.limes.core.measures.measure;

public enum MeasureType { 
    GEO_NAIVE_HAUSDORFF, GEO_INDEXED_HAUSDORFF, GEO_FAST_HAUSDORFF, 
    GEO_CENTROIDHAUSDORFF, GEO_SCAN_HAUSDORFF, GEO_MIN, GEO_MAX, 
    GEO_AVG, GEO_SUM_OF_MIN, GEO_LINK, GEO_QUINLAN, GEO_FRECHET, 
    GEO_SURJECTION, GEO_FAIR_SURJECTION, GEO_MEAN,
    TMP_EQUALS, TMP_IS_OVERLAPPED_BY, TMP_OVERLAPS, TMP_DURING,
    TMP_DURING_REVERSE, TMP_IS_STARTED_BY, TMP_STARTS, TMP_IS_FINISHED_BY,
    TMP_FINISHES, TMP_IS_MET_BY, TMP_MEETS, TMP_AFTER,
    TMP_BEFORE, TMP_CONCURRENT, TMP_PREDECESSOR, TMP_SUCCESSOR,
    COSINE, EXACTMATCH, JACCARD, JARO,LEVENSHTEIN, OVERLAP, 
    TRIGRAM, QGRAMS, SOUNDEX, EUCLIDEAN
}
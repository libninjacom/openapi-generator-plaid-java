/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.64.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of the transfer.
 */
@JsonAdapter(TransferStatus.Adapter.class)
public enum TransferStatus {
  
  PENDING("pending"),
  
  POSTED("posted"),
  
  CANCELLED("cancelled"),
  
  FAILED("failed"),
  
  REVERSED("reversed");

  private String value;

  TransferStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferStatus fromValue(String value) {
    for (TransferStatus b : TransferStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TransferStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferStatus.fromValue(value);
    }
  }
}




# PayPeriodDetails

Details about the pay period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkAmount** | **BigDecimal** | The amount of the paycheck. |  [optional] |
|**distributionBreakdown** | **List&lt;DistributionBreakdown&gt;** |  |  [optional] |
|**endDate** | **LocalDate** | The pay period end date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;. |  [optional] |
|**grossEarnings** | **BigDecimal** | Total earnings before tax/deductions. |  [optional] |
|**payDate** | **LocalDate** | The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;). |  [optional] |
|**payFrequency** | [**PayFrequencyEnum**](#PayFrequencyEnum) | The frequency at which an individual is paid. |  [optional] |
|**payDay** | **LocalDate** | The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;). |  [optional] |
|**startDate** | **LocalDate** | The pay period start date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;. |  [optional] |



## Enum: PayFrequencyEnum

| Name | Value |
|---- | -----|
| PAY_FREQUENCY_UNKNOWN | &quot;PAY_FREQUENCY_UNKNOWN&quot; |
| PAY_FREQUENCY_WEEKLY | &quot;PAY_FREQUENCY_WEEKLY&quot; |
| PAY_FREQUENCY_BIWEEKLY | &quot;PAY_FREQUENCY_BIWEEKLY&quot; |
| PAY_FREQUENCY_SEMIMONTHLY | &quot;PAY_FREQUENCY_SEMIMONTHLY&quot; |
| PAY_FREQUENCY_MONTHLY | &quot;PAY_FREQUENCY_MONTHLY&quot; |
| NULL | &quot;null&quot; |




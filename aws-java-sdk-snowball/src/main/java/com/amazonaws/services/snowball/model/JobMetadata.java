/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a specific job including shipping information, job status, and other important metadata.
 * This information is returned as a part of the response syntax of the <code>DescribeJob</code> action.
 * </p>
 */
public class JobMetadata implements Serializable, Cloneable {

    /**
     * <p>
     * The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The current state of the jobs.
     * </p>
     */
    private String jobState;
    /**
     * <p>
     * The type of job.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * The creation date for this job.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * An array of <code>S3Resource</code> objects. Each <code>S3Resource</code> object represents an Amazon S3 bucket
     * that your transferred data will be exported from or imported into.
     * </p>
     */
    private JobResource resources;
    /**
     * <p>
     * The description of the job, provided at job creation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job. This
     * ARN was created using the <code>CreateKey</code> API action in AWS KMS.
     * </p>
     */
    private String kmsKeyARN;
    /**
     * <p>
     * The role ARN associated with this job. This ARN was created using the <code>CreateRole</code> API action in AWS
     * Identity and Access Management (IAM).
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     */
    private String addressId;
    /**
     * <p>
     * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
     * </p>
     */
    private ShippingDetails shippingDetails;
    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose between
     * 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * </p>
     */
    private String snowballCapacityPreference;
    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The
     * <code>Notification</code> object is returned as a part of the response syntax of the <code>DescribeJob</code>
     * action in the <code>JobMetadata</code> data type.
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * A value that defines the real-time status of a Snowball's data transfer while the appliance is at AWS. Note that
     * this data is only available while a job has a <code>JobState</code> value of <code>InProgress</code>, for both
     * import and export jobs.
     * </p>
     */
    private DataTransfer dataTransferProgress;
    /**
     * <p>
     * Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes
     * available at the end of the import process. For export jobs, your job report typically becomes available while
     * the Snowball for your job part is being delivered to you.
     * </p>
     */
    private JobLogs jobLogInfo;

    /**
     * <p>
     * The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>
     *        .
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The automatically generated ID for a job, for example
     *         <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The current state of the jobs.
     * </p>
     * 
     * @param jobState
     *        The current state of the jobs.
     * @see JobState
     */

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    /**
     * <p>
     * The current state of the jobs.
     * </p>
     * 
     * @return The current state of the jobs.
     * @see JobState
     */

    public String getJobState() {
        return this.jobState;
    }

    /**
     * <p>
     * The current state of the jobs.
     * </p>
     * 
     * @param jobState
     *        The current state of the jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public JobMetadata withJobState(String jobState) {
        setJobState(jobState);
        return this;
    }

    /**
     * <p>
     * The current state of the jobs.
     * </p>
     * 
     * @param jobState
     *        The current state of the jobs.
     * @see JobState
     */

    public void setJobState(JobState jobState) {
        this.jobState = jobState.toString();
    }

    /**
     * <p>
     * The current state of the jobs.
     * </p>
     * 
     * @param jobState
     *        The current state of the jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public JobMetadata withJobState(JobState jobState) {
        setJobState(jobState);
        return this;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @param jobType
     *        The type of job.
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @return The type of job.
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @param jobType
     *        The type of job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public JobMetadata withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @param jobType
     *        The type of job.
     * @see JobType
     */

    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @param jobType
     *        The type of job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public JobMetadata withJobType(JobType jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     * 
     * @param creationDate
     *        The creation date for this job.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     * 
     * @return The creation date for this job.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     * 
     * @param creationDate
     *        The creation date for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects. Each <code>S3Resource</code> object represents an Amazon S3 bucket
     * that your transferred data will be exported from or imported into.
     * </p>
     * 
     * @param resources
     *        An array of <code>S3Resource</code> objects. Each <code>S3Resource</code> object represents an Amazon S3
     *        bucket that your transferred data will be exported from or imported into.
     */

    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects. Each <code>S3Resource</code> object represents an Amazon S3 bucket
     * that your transferred data will be exported from or imported into.
     * </p>
     * 
     * @return An array of <code>S3Resource</code> objects. Each <code>S3Resource</code> object represents an Amazon S3
     *         bucket that your transferred data will be exported from or imported into.
     */

    public JobResource getResources() {
        return this.resources;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects. Each <code>S3Resource</code> object represents an Amazon S3 bucket
     * that your transferred data will be exported from or imported into.
     * </p>
     * 
     * @param resources
     *        An array of <code>S3Resource</code> objects. Each <code>S3Resource</code> object represents an Amazon S3
     *        bucket that your transferred data will be exported from or imported into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withResources(JobResource resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The description of the job, provided at job creation.
     * </p>
     * 
     * @param description
     *        The description of the job, provided at job creation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the job, provided at job creation.
     * </p>
     * 
     * @return The description of the job, provided at job creation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the job, provided at job creation.
     * </p>
     * 
     * @param description
     *        The description of the job, provided at job creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job. This
     * ARN was created using the <code>CreateKey</code> API action in AWS KMS.
     * </p>
     * 
     * @param kmsKeyARN
     *        The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job.
     *        This ARN was created using the <code>CreateKey</code> API action in AWS KMS.
     */

    public void setKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job. This
     * ARN was created using the <code>CreateKey</code> API action in AWS KMS.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job.
     *         This ARN was created using the <code>CreateKey</code> API action in AWS KMS.
     */

    public String getKmsKeyARN() {
        return this.kmsKeyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job. This
     * ARN was created using the <code>CreateKey</code> API action in AWS KMS.
     * </p>
     * 
     * @param kmsKeyARN
     *        The Amazon Resource Name (ARN) for the AWS Key Management Service (AWS KMS) key associated with this job.
     *        This ARN was created using the <code>CreateKey</code> API action in AWS KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withKmsKeyARN(String kmsKeyARN) {
        setKmsKeyARN(kmsKeyARN);
        return this;
    }

    /**
     * <p>
     * The role ARN associated with this job. This ARN was created using the <code>CreateRole</code> API action in AWS
     * Identity and Access Management (IAM).
     * </p>
     * 
     * @param roleARN
     *        The role ARN associated with this job. This ARN was created using the <code>CreateRole</code> API action
     *        in AWS Identity and Access Management (IAM).
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The role ARN associated with this job. This ARN was created using the <code>CreateRole</code> API action in AWS
     * Identity and Access Management (IAM).
     * </p>
     * 
     * @return The role ARN associated with this job. This ARN was created using the <code>CreateRole</code> API action
     *         in AWS Identity and Access Management (IAM).
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The role ARN associated with this job. This ARN was created using the <code>CreateRole</code> API action in AWS
     * Identity and Access Management (IAM).
     * </p>
     * 
     * @param roleARN
     *        The role ARN associated with this job. This ARN was created using the <code>CreateRole</code> API action
     *        in AWS Identity and Access Management (IAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     * 
     * @param addressId
     *        The ID for the address that you want the Snowball shipped to.
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     * 
     * @return The ID for the address that you want the Snowball shipped to.
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * The ID for the address that you want the Snowball shipped to.
     * </p>
     * 
     * @param addressId
     *        The ID for the address that you want the Snowball shipped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
     * </p>
     * 
     * @param shippingDetails
     *        A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
     */

    public void setShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    /**
     * <p>
     * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
     * </p>
     * 
     * @return A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
     */

    public ShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * <p>
     * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
     * </p>
     * 
     * @param shippingDetails
     *        A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withShippingDetails(ShippingDetails shippingDetails) {
        setShippingDetails(shippingDetails);
        return this;
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose between
     * 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose
     *        between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose between
     * 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * </p>
     * 
     * @return The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose
     *         between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * @see SnowballCapacity
     */

    public String getSnowballCapacityPreference() {
        return this.snowballCapacityPreference;
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose between
     * 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose
     *        between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballCapacity
     */

    public JobMetadata withSnowballCapacityPreference(String snowballCapacityPreference) {
        setSnowballCapacityPreference(snowballCapacityPreference);
        return this;
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose between
     * 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose
     *        between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
    }

    /**
     * <p>
     * The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose between
     * 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        The Snowball capacity preference for this job, specified at job creation. In US regions, you can choose
     *        between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballCapacity
     */

    public JobMetadata withSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        setSnowballCapacityPreference(snowballCapacityPreference);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The
     * <code>Notification</code> object is returned as a part of the response syntax of the <code>DescribeJob</code>
     * action in the <code>JobMetadata</code> data type.
     * </p>
     * 
     * @param notification
     *        The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job.
     *        The <code>Notification</code> object is returned as a part of the response syntax of the
     *        <code>DescribeJob</code> action in the <code>JobMetadata</code> data type.
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The
     * <code>Notification</code> object is returned as a part of the response syntax of the <code>DescribeJob</code>
     * action in the <code>JobMetadata</code> data type.
     * </p>
     * 
     * @return The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job.
     *         The <code>Notification</code> object is returned as a part of the response syntax of the
     *         <code>DescribeJob</code> action in the <code>JobMetadata</code> data type.
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The
     * <code>Notification</code> object is returned as a part of the response syntax of the <code>DescribeJob</code>
     * action in the <code>JobMetadata</code> data type.
     * </p>
     * 
     * @param notification
     *        The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job.
     *        The <code>Notification</code> object is returned as a part of the response syntax of the
     *        <code>DescribeJob</code> action in the <code>JobMetadata</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * A value that defines the real-time status of a Snowball's data transfer while the appliance is at AWS. Note that
     * this data is only available while a job has a <code>JobState</code> value of <code>InProgress</code>, for both
     * import and export jobs.
     * </p>
     * 
     * @param dataTransferProgress
     *        A value that defines the real-time status of a Snowball's data transfer while the appliance is at AWS.
     *        Note that this data is only available while a job has a <code>JobState</code> value of
     *        <code>InProgress</code>, for both import and export jobs.
     */

    public void setDataTransferProgress(DataTransfer dataTransferProgress) {
        this.dataTransferProgress = dataTransferProgress;
    }

    /**
     * <p>
     * A value that defines the real-time status of a Snowball's data transfer while the appliance is at AWS. Note that
     * this data is only available while a job has a <code>JobState</code> value of <code>InProgress</code>, for both
     * import and export jobs.
     * </p>
     * 
     * @return A value that defines the real-time status of a Snowball's data transfer while the appliance is at AWS.
     *         Note that this data is only available while a job has a <code>JobState</code> value of
     *         <code>InProgress</code>, for both import and export jobs.
     */

    public DataTransfer getDataTransferProgress() {
        return this.dataTransferProgress;
    }

    /**
     * <p>
     * A value that defines the real-time status of a Snowball's data transfer while the appliance is at AWS. Note that
     * this data is only available while a job has a <code>JobState</code> value of <code>InProgress</code>, for both
     * import and export jobs.
     * </p>
     * 
     * @param dataTransferProgress
     *        A value that defines the real-time status of a Snowball's data transfer while the appliance is at AWS.
     *        Note that this data is only available while a job has a <code>JobState</code> value of
     *        <code>InProgress</code>, for both import and export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withDataTransferProgress(DataTransfer dataTransferProgress) {
        setDataTransferProgress(dataTransferProgress);
        return this;
    }

    /**
     * <p>
     * Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes
     * available at the end of the import process. For export jobs, your job report typically becomes available while
     * the Snowball for your job part is being delivered to you.
     * </p>
     * 
     * @param jobLogInfo
     *        Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes
     *        available at the end of the import process. For export jobs, your job report typically becomes available
     *        while the Snowball for your job part is being delivered to you.
     */

    public void setJobLogInfo(JobLogs jobLogInfo) {
        this.jobLogInfo = jobLogInfo;
    }

    /**
     * <p>
     * Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes
     * available at the end of the import process. For export jobs, your job report typically becomes available while
     * the Snowball for your job part is being delivered to you.
     * </p>
     * 
     * @return Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report
     *         becomes available at the end of the import process. For export jobs, your job report typically becomes
     *         available while the Snowball for your job part is being delivered to you.
     */

    public JobLogs getJobLogInfo() {
        return this.jobLogInfo;
    }

    /**
     * <p>
     * Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes
     * available at the end of the import process. For export jobs, your job report typically becomes available while
     * the Snowball for your job part is being delivered to you.
     * </p>
     * 
     * @param jobLogInfo
     *        Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes
     *        available at the end of the import process. For export jobs, your job report typically becomes available
     *        while the Snowball for your job part is being delivered to you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobMetadata withJobLogInfo(JobLogs jobLogInfo) {
        setJobLogInfo(jobLogInfo);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getJobState() != null)
            sb.append("JobState: " + getJobState() + ",");
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKmsKeyARN() != null)
            sb.append("KmsKeyARN: " + getKmsKeyARN() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getAddressId() != null)
            sb.append("AddressId: " + getAddressId() + ",");
        if (getShippingDetails() != null)
            sb.append("ShippingDetails: " + getShippingDetails() + ",");
        if (getSnowballCapacityPreference() != null)
            sb.append("SnowballCapacityPreference: " + getSnowballCapacityPreference() + ",");
        if (getNotification() != null)
            sb.append("Notification: " + getNotification() + ",");
        if (getDataTransferProgress() != null)
            sb.append("DataTransferProgress: " + getDataTransferProgress() + ",");
        if (getJobLogInfo() != null)
            sb.append("JobLogInfo: " + getJobLogInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobMetadata == false)
            return false;
        JobMetadata other = (JobMetadata) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobState() == null ^ this.getJobState() == null)
            return false;
        if (other.getJobState() != null && other.getJobState().equals(this.getJobState()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyARN() == null ^ this.getKmsKeyARN() == null)
            return false;
        if (other.getKmsKeyARN() != null && other.getKmsKeyARN().equals(this.getKmsKeyARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getShippingDetails() == null ^ this.getShippingDetails() == null)
            return false;
        if (other.getShippingDetails() != null && other.getShippingDetails().equals(this.getShippingDetails()) == false)
            return false;
        if (other.getSnowballCapacityPreference() == null ^ this.getSnowballCapacityPreference() == null)
            return false;
        if (other.getSnowballCapacityPreference() != null && other.getSnowballCapacityPreference().equals(this.getSnowballCapacityPreference()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getDataTransferProgress() == null ^ this.getDataTransferProgress() == null)
            return false;
        if (other.getDataTransferProgress() != null && other.getDataTransferProgress().equals(this.getDataTransferProgress()) == false)
            return false;
        if (other.getJobLogInfo() == null ^ this.getJobLogInfo() == null)
            return false;
        if (other.getJobLogInfo() != null && other.getJobLogInfo().equals(this.getJobLogInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobState() == null) ? 0 : getJobState().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyARN() == null) ? 0 : getKmsKeyARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode + ((getShippingDetails() == null) ? 0 : getShippingDetails().hashCode());
        hashCode = prime * hashCode + ((getSnowballCapacityPreference() == null) ? 0 : getSnowballCapacityPreference().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getDataTransferProgress() == null) ? 0 : getDataTransferProgress().hashCode());
        hashCode = prime * hashCode + ((getJobLogInfo() == null) ? 0 : getJobLogInfo().hashCode());
        return hashCode;
    }

    @Override
    public JobMetadata clone() {
        try {
            return (JobMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

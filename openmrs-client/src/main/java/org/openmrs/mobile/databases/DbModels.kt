package org.openmrs.mobile.databases

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


open class BaseModel(
        @NonNull
        @PrimaryKey(autoGenerate = true)
        open var uid: String
)

@Entity
data class Concept(
        var id: String,
        var uuid: String,
        var display: String
) : BaseModel(id)

@Entity
data class Encounter(
        var id: String,
        var uuid: String,
        var visitKeyId: String,
        var display: String,
        var encounterDateTime: String,
        var encounterType: String,
        var patientUuid: String,
        var formUuid: String
) : BaseModel(id)

@Entity
data class Visit(
        var id: String,
        var uuid: String,
        var patientKeyId: String,
        var visitType: String,
        var visitDate: String,
        var startDate: String,
        var stopDate: String
) : BaseModel(id)

@Entity
data class Observation(
        var id: String,
        var uuid: String,
        var encounterKeyId: Int,
        var display: String,
        var displayValue: String,
        var diagnosisOrder: String,
        var diagnosisList: String,
        var diagnosisCertainty: String,
        var diagnosisNote: String,
        var conceptUuid: String
) : BaseModel(id)

@Entity
data class Location(
        var id: String,
        var uuid: String,
        var display: String,
        var name: String,
        var description: String,
        var addressLine1: String,
        var addressLine2: String,
        var city: String,
        var state: String,
        var country: String,
        var postalcode: Int,
        var parentLocationUuid: String
) : BaseModel(id)

@Entity
data class Patient(
        var id: String,
        var uuid: String,
        var display: String,
        var synced: Boolean,
        var identifier: Boolean,
        var givenName: String,
        var middleName: String,
        var familyName: String,
        var gender: String,
        var birthDate: String,
        var deathDate: String,
        var causeOfDeath: String,
        var age: Int,
        var photo: String,
        var addressLine1: String,
        var addressLine2: String,
        var city: String,
        var state: String,
        var country: String,
        var postalcode: Int,
        var encounters: String
) : BaseModel(id)
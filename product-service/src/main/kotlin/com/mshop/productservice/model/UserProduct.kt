package com.mshop.productservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("users_products")
data class UserProduct(
    @Id
    @Column("user_product_id")
    val userProductId: String,

    @Column("product_id")
    val productId: String,

    @Column("user_id")
    val userId: String,

    @Column("rate")
    val rate: Float,

    @Column("match_rate")
    var matchRate: Float,

    @Column("avg_rate")
    var avgRate: Float,

    @Column("is_reviewed")
    val isReviewed: Boolean,

    @Column("is_purchased")
    var isPurchased: Boolean,

    @Column("comment")
    val comment: String,

    @Column("updated_at")
    val updatedAt: LocalDateTime = LocalDateTime.now(),

    @Column("created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    ) : Persistable<String> {

    @Transient
    var images: List<Image>? = null

    @Transient
    internal var isNewUserProduct: Boolean = false

    override fun getId(): String = userProductId

    override fun isNew(): Boolean = isNewUserProduct
}
